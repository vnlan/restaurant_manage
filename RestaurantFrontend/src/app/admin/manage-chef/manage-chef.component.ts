import { AfterViewInit, Component, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { AddChefModalComponent } from './add-chef-modal.component';
import { DeleteChefModalComponent } from './delete-chef-modal.component';
import { EditChefModalComponent } from './edit-chef-modal.component';
import { ChefService } from './../../service/chef-service';
import { chef } from 'src/app/model/chef';
import { FormBuilder } from '@angular/forms';


@Component({
  selector: 'app-manage-chef',
  templateUrl: './manage-chef.component.html',
  styleUrls: ['./manage-chef.component.css']
})
export class ManageChefComponent implements OnInit{

  namesend: string | "" = "";
  chefList: chef[] | null = null;
  listChefSearched: any = [];
  fil!: string ;

    formFil = this.fb.group({
      Fil:[]
    })
  constructor(private modalService: NgbModal, private chefService: ChefService, private fb: FormBuilder) { }

  ngOnInit(): void {

    this.getAllChef();
    this.chefService.notifyObservable$.subscribe(res => {
      if (res.reload) {
        this.getAllChef();
      }
    });
  }

  openAddModal(){
    this.modalService.open(AddChefModalComponent, {size: 'lg'});
  }
  openDeleteModal(chef : chef){
    const modalRef = this.modalService.open(DeleteChefModalComponent, {size: 'md'});
    modalRef.componentInstance.chef = chef;
  }
  openEditModal(chef : chef){
    const modalRef = this.modalService.open(EditChefModalComponent, {size: 'lg'});
    modalRef.componentInstance.chefI = chef;
    modalRef.componentInstance.isView= false;
  }
  openViewModal(chef : chef){
    const modalRef = this.modalService.open(EditChefModalComponent, {size: 'lg'});
    modalRef.componentInstance.chefI = chef;
    modalRef.componentInstance.isView= true;
  }
  getAllChef(){
    this.chefService.getChef().subscribe((res:chef[]) => {
      this.chefList = res;
    });
  }
  searchChefByName(event : any){
    this.namesend = event;
    if(this.namesend==""){
      this.getAllChef();
    }else{
      this.chefService.searchChefByName(this.namesend).subscribe((data:chef[])=>{
        this.listChefSearched = data;
        this.chefList = this.listChefSearched;
      })
    } 
  }
  setFil(){
    if(this.formFil.get(['Fil'])!.value == '2'){
      this.getAllChef();
    }else{
      this.chefService.filterChefByStatus(this.formFil.get(['Fil'])!.value).subscribe((res:chef[]) => {
        this.chefList = res;
      });
    }
   
  }

  // filterChefByStatus(status: number){
  //   if(th == '2'){
  //     this.getAllChef();
  //   }
  // }

  filterChefByStatus(chefStatus:any) {
    if ( chefStatus == '2'){
      this.getAllChef();
    }else{
      this.chefService.filterChefByStatus(chefStatus).subscribe((res:chef[]) => {
        this.chefList = res;
      });
    }
  }
}

