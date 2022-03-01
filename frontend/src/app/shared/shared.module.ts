import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from './app-material/app-material.module';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';
import { ProgressPipe } from './pipes/progress.pipe';


@NgModule({
  declarations: [
    ErrorDialogComponent,
    ProgressPipe
  ],
  imports: [
    CommonModule,
    AppMaterialModule
  ],
  exports: [
    ErrorDialogComponent,
    ProgressPipe
  ]
})
export class SharedModules { }
