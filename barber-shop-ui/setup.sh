#clients
ng g c clients/new-client ^
&& ng g c clients/list-clients ^
&& ng g c clients/edit-client ^
&& ng g c clients/components/client-form ^
&& ng g c clients/components/client-table ^

&& type NUL > src/app/clients/client.models.ts ^

#schedules
&& ng g c schedules/schedules-month ^
&& ng g c schedules/components/schedule-calendar ^

&& type NUL > src/app/schedules/schedule.models.ts ^

#commons components
&& ng g c commons/components/card-header ^
&& ng g c commons/components/menu-bar ^
&& ng g c commons/components/yes-no-dialog ^

#service
&& ng g s services/dialog-manager ^
&& ng g s services/snackbar-manager ^
&& ng g s services/api-client/clients/clients ^
&& ng g s services/api-client/schedules/schedules ^

&& type NUL > src/app/services/idialog-manager.service.ts ^
&& type NUL > src/app/services/isnackbar-manager.service.ts ^
&& type NUL > src/app/services/service.token.ts ^

&& type NUL > src/app/services/api-client/clients/iclients.service.ts ^
&& type NUL > src/app/services/api-client/clients/client.models.ts ^

&& type NUL > src/app/services/api-client/schedules/schedules.service.ts ^
&& type NUL > src/app/services/api-client/schedules/schedule.models.ts ^

&& npm install @angular/cdk bootstrap ngx-mask

