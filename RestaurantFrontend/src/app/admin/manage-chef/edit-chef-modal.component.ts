import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { chef, chefClass } from 'src/app/model/chef';
import { ChefService } from 'src/app/service/chef-service';

@Component({
  selector: 'app-edit-chef-modal',
  templateUrl: './edit-chef-modal.component.html',

})
export class EditChefModalComponent implements OnInit {
  chefList: chef[] | null = null;
  chefI: chef | null = null;
  isView: boolean | null = null;
  formEdit = this.fb.group({
    id: [],
    chefname: [],
    sex:[],
    dateofbirth:[],
    workingyears:[],
    salary:[],
    status:[],
    description: [],
  })
  constructor(private fb : FormBuilder, private chefService: ChefService,private modal:NgbActiveModal) { }

  ngOnInit(): void {
     this.formEdit.patchValue({
        id: this.chefI?.id,
        chefname: this.chefI?.name,
        sex:this.chefI?.sex,
        dateofbirth:this.chefI?.dateofbirth,
        workingyears:this.chefI?.workingyears,
       
        salary:this.chefI?.salary,
        status:this.chefI?.status,
        description: this.chefI?.description,

     })
  }
  private createFromForm() : void {
    this.chefI = {
     ...new chefClass(),
     id:this.formEdit.get(['id'])!.value,
   name: this.formEdit.get(['chefname'])!.value,
   sex:this.formEdit.get(['sex'])!.value,
   dateofbirth:this.formEdit.get(['dateofbirth'])!.value,
   workingyears:this.formEdit.get(['workingyears'])!.value,
   salary:this.formEdit.get(['salary'])!.value,
   status:this.formEdit.get(['status'])!.value,
   description: this.formEdit.get(['description'])!.value,
   }
 }
updateChef(): void {
  this.createFromForm();
  this.chefService.updateChef(this.chefI!).subscribe(()=>{
    this.chefService.notifyOther({ reload: true });
    this.close();
    });
  }
close(): void {
  this.modal.close();
  
}
getAllChef(){
  this.chefService.getChef().subscribe((res:chef[]) => {
    this.chefList = res;
  });
}
}
