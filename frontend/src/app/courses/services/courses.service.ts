import { Injectable } from '@angular/core';
import { Course } from '../model/course';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {
  constructor() { }

  findAll(): Course[] {
    return [
      {_id: '1', name: 'Angular', category: 'FrontEnd' }
    ];
  }
}
