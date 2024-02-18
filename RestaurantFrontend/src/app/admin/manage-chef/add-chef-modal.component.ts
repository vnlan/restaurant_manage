import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { chef, chefClass } from 'src/app/model/chef';
import { ChefService } from 'src/app/service/chef-service';

@Component({
  selector: 'app-add-chef-modal',
  templateUrl: './add-chef-modal.component.html'
})
export class AddChefModalComponent implements OnInit {
  chefI: chef | null = null;
  date: Date | null = null;
  formAdd = this.fb.group({
    chefname: [],
    sex:[],
    dateofbirth:[],
    workingyears:[],
    datestartworking:[],
    salary:[],
    status:[],
    description: [],
  })
  constructor(private fb : FormBuilder, private chefService: ChefService,private modal:NgbActiveModal) { }

  ngOnInit(): void {
    this.getDate();
    console.log(this.date);
  }

private createFromForm() : void {
   this.chefI = {
    ...new chefClass(),
  name: this.formAdd.get(['chefname'])!.value,
  sex:this.formAdd.get(['sex'])!.value,
  dateofbirth:this.formAdd.get(['dateofbirth'])!.value,
  workingyears:this.formAdd.get(['workingyears'])!.value,
  datestartworking: this.date!,
  salary:this.formAdd.get(['salary'])!.value,
  status:this.formAdd.get(['status'])!.value,
  description: this.formAdd.get(['description'])!.value,
  }
}
 addChef():void{
   this.createFromForm();
   this.chefService.addChef(this.chefI!).subscribe(
     ()=>{
        this.chefService.notifyOther({ reload: true });
        this.formAdd.reset();
       this.close();
      }
   );
  
 }

  close(): void { 
      this.modal.dismiss();
  }

  getDate() :void {
    const model = new Date();
    const year = model.getFullYear();
    const month = model.getMonth();
    const day = model.getDate();

    const temp = year + "-" + (month<10?("0"+month):(month))+"-"+(day<10?("0"+day):(day));
    this.date = new Date(temp);
  }
}

