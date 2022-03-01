import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { catchError, Observable, of } from 'rxjs';
import { Course } from '../model/course';
import { CoursesService } from '../services/courses.service';
import { ErrorDialogComponent } from '../../shared/components/error-dialog/error-dialog.component';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit {

  courses$: Observable<Course[]>;
  displayedColumns = ["name", "category"];

  constructor(
    private  coursesService: CoursesService,
    public dialog: MatDialog
    ) {
    this.courses$ = this.coursesService.findAll().pipe(
      catchError(error => {
        this.onErrorDialog("Erro ao carregar dados dos cursos!");
        return of([])
      })
    );
   }

   onErrorDialog(errorMsg: string){
     this.dialog.open( ErrorDialogComponent,{
       data: errorMsg 
     });
   }

  ngOnInit(): void {  }

}
