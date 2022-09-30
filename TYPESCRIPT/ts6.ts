interface IPerson{
    firstName:string,
    lastName:string,
    sayHi:()=>string
}

var customer:IPerson ={
    firstName:"Tom",
    lastName:"Hanks",
    sayHi:():string=>{return "HI there"}
}

console.log("Customer Object")
console.log(customer.firstName)
console.log(customer.lastName)
console.log(customer.sayHi())

var employee:IPerson={
    firstName:"Jim",
    lastName:"Balkes",
    sayHi:():string=>{return "Hello!!!"}
}

console.log("Employe Object")
console.log(employee.firstName);
console.log(employee.lastName);