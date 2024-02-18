import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http'
import { AppComponent } from './app.component';
import { ManageChefComponent } from './admin/manage-chef/manage-chef.component';
import { AddChefModalComponent } from './admin/manage-chef/add-chef-modal.component';
import { NgbDatepickerModule, NgbModalModule, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { DeleteChefModalComponent } from './admin/manage-chef/delete-chef-modal.component';
import { EditChefModalComponent } from './admin/manage-chef/edit-chef-modal.component';
import { ChefService } from './service/chef-service';
import { ReactiveFormsModule,FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    ManageChefComponent,
    AddChefModalComponent,
    DeleteChefModalComponent,
    EditChefModalComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    NgbDatepickerModule,
  ],
  providers: [ChefService],
  bootstrap: [AppComponent]
})
export class AppModule { }
