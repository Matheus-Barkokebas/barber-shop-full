import { InjectionToken } from '@angular/core';
import { ICLientService } from './api-client/clients/iclients.service';
import { ISnackbarManagerService } from './isnackbar-manager.service';
import { IDialogManagerService } from './idialog-manager.service';
import { IScheduleService } from './api-client/schedules/ischedules.service';

export const SERVICES_TOKEN = {
  HTTP: {
    CLIENT: new InjectionToken<ICLientService>('SERVICES_TOKEN.HTTP.CLIENT'),
    SCHEDULE: new InjectionToken<IScheduleService>('SERVICES_TOKEN.HTTP.SCHEDULE'),
  },
  SNACKBAR: new InjectionToken<ISnackbarManagerService>('SNACKBAR_TOKEN.SNACKBAR'),
  DIALOG: new InjectionToken<IDialogManagerService>('SNACKBAR_TOKEN.DIALOG')

};
