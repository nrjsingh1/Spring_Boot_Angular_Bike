import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs'
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application-json' })
};
@Injectable({
  providedIn: 'root'
})
export class BikeService {

  constructor(private http: HttpClient) { }

  getBikes() {
    return this.http.get('/server/api/ver1/bikes');
  }

  getBike(id: Number) {
    return this.http.get('/server/api/ver1/bikes/' + id);
  }

  createBikeRegistration(bike) {
    let body = JSON.stringify(bike);
    return this.http.post('server/api/ver1/bikes', body, httpOptions);
  }
}
