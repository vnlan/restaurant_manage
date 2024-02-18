import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { chef } from '../model/chef';


@Injectable({
  providedIn: 'root'
})
export class ChefService {

  public notify = new BehaviorSubject<any>('');

  notifyObservable$ = this.notify.asObservable();

  // eslint-disable-next-line @typescript-eslint/explicit-function-return-type
  public notifyOther(data: any) {
    if (data) {
      this.notify.next(data);
    }
  }

  
  url = "http://localhost:8081";
  constructor(public http:HttpClient) { }

  getChef():Observable<chef[]>{
    return this.http.get<chef[]>(this.url+"/api/get-chef");
  }
  addChef(chef:chef):Observable<chef>{
      return this.http.post(this.url+"/api/add-chef",chef)
  }
  deleteChef(id:number):Observable<chef>{
      return this.http.delete(this.url+"/api/delete-chef/"+id);
  }
  updateChef(chefI: chef):Observable<chef>{
      return this.http.put(this.url+"/api/update-chef",chefI);
  }
  searchChefByName(name: string): Observable<chef[]>{
    return this.http.get<chef[]>(this.url+"/api/find-chef-by-name/"+name);
  }
  filterChefByStatus(status: string): Observable<chef[]>{
    return this.http.get<chef[]>(this.url+"/api/filter-chef-by-status/"+status)
  }
}