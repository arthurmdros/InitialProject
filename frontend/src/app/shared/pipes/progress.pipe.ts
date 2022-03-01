import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'progress'
})
export class ProgressPipe implements PipeTransform {
  transform(value: string): string {
    switch(value){
      case 'Concluído': return 'done';
      case 'Em progresso': return 'schedule';
      case 'Não concluído': return 'close'
    }
    return 'close';
  }
}

