import { Component, OnInit } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { chef } from 'src/app/model/chef';
import { ChefService } from 'src/app/service/chef-service';

@Component({
  selector: 'app-delete-chef-modal',
  templateUrl: './delete-chef-modal.component.html',

})
export class DeleteChefModalComponent implements OnInit {
  chef: chef| null = null;
  constructor(private modal: NgbActiveModal, private chefService: ChefService) { }

  ngOnInit(): void {
  }

  close(): void { 
      this.modal.dismiss();
  }
  deleteChef(): void {
      this.chefService.deleteChef(this.chef?.id!).subscribe(
        (res) => {},
        (err) => {
          this.chefService.notifyOther({ reload: true });
          this.close();
        }
      );
      
  }


}
