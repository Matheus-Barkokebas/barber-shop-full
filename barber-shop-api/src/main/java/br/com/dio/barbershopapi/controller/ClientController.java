package br.com.dio.barbershopapi.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.barbershopapi.controller.request.SaveClientRequest;
import br.com.dio.barbershopapi.controller.request.UpdateClientRequest;
import br.com.dio.barbershopapi.controller.response.ClientDetailResponse;
import br.com.dio.barbershopapi.controller.response.ListClientResponse;
import br.com.dio.barbershopapi.controller.response.SaveClientResponse;
import br.com.dio.barbershopapi.controller.response.UpdateClientResponse;
import br.com.dio.barbershopapi.entity.mapper.IClientMapper;
import br.com.dio.barbershopapi.service.IClientService;
import br.com.dio.barbershopapi.service.query.IClientQueryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("clients")
@AllArgsConstructor
public class ClientController {

	private IClientService service;

	private IClientQueryService queryService;

	private IClientMapper mapper;

	@PostMapping
	@ResponseStatus(CREATED)
	SaveClientResponse save(@RequestBody @Valid final SaveClientRequest request) {
		var entity = mapper.toEntity(request);
		service.save(entity);
		return mapper.toSaveResponse(entity);
	}

	@PutMapping("{id}")
	UpdateClientResponse update(@PathVariable("id") final long id, @RequestBody @Valid final UpdateClientRequest request) {
	    var entity = mapper.toEntity(id, request);
	    service.update(entity);
	    return mapper.toUpdateResponse(entity);
	}

	@DeleteMapping("{id}")
	@ResponseStatus(NO_CONTENT)
	void delete(@PathVariable("id") final long id) {
	    service.delete(id);
	}

	@GetMapping("{id}")
	ClientDetailResponse findById(@PathVariable("id") final long id) {
	    var entity = queryService.findById(id);
	    return mapper.toDetailResponse(entity);
	}
	
	@GetMapping
	List<ListClientResponse> list() {
		var entities = queryService.list();
		return mapper.toListResponse(entities);
	}

}