package br.com.dio.barbershopapi.exception;

public class ScheduleInUseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ScheduleInUseException(String message) {
        super(message);
    }

}