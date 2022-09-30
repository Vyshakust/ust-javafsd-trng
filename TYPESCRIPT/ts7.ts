class Car{
    engine:string;


constructor(engine:string){
    this.engine=engine;
}

disp():void{
    console.log("function display engine is: "+this.engine)
}
}

var ob = new Car("XXSY1")

console.log("Reading attribute value Engine as :"+ob.engine)