import { Component } from "@angular/core"


@Component({
    selector: 'hello',
    templateUrl:'./hello.component.html'
})
export class HelloComponent{
    nome : string ;
    clientes: Cliente[] | undefined;

    constructor(){
        this.nome = 'Ranelho';
        let fulano = new Cliente('Fulano', 30);
        let cicrano = new Cliente('Cicrano', 25);

        this.clientes = [fulano, cicrano];
    }
    
}

class Cliente {
    constructor(        
        public nome : string,
        public idade : number
    ){  }    

}