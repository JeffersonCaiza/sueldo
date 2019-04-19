#include<iostream>
using namespace std;
int main()
{
	double sueldo,total,porcentaje,categoria;
	cout<<"calculo de sueldo"<<endl;
	cout<<"ingrese el sueldo"<<endl;
	cin>>sueldo;
	cout<<"ingrese la categoria"<<endl;
	cin>>categoria;
	if(categoria==1){
	porcentaje=sueldo*0.15;
    total=porcentaje+sueldo;
    cout<<"Categoria "<<categoria<<endl;
    cout<<"Sueldo anterior "<<sueldo<<endl;
    cout<<"Nuevo sueldo "<<total<<endl;
	}
	
	else if(categoria==2){
	porcentaje=sueldo*0.10;
    total=porcentaje+sueldo;
    cout<<"Categoria "<<categoria<<endl;
    cout<<"Sueldo anterior "<<sueldo<<endl;
    cout<<"Nuevo sueldo "<<total<<endl;
  
	}
	
	else if(categoria==3){
	porcentaje=sueldo*0.08;
    total=porcentaje+sueldo;
    cout<<"Categoria "<<categoria<<endl;
    cout<<"Sueldo anterior "<<sueldo<<endl;
    cout<<"Nuevo sueldo "<<total<<endl;
	}
	
	else if(categoria==4){
	porcentaje=sueldo*0.07;
    total=porcentaje+sueldo;
    cout<<"Categoria "<<categoria<<endl;
    cout<<"Sueldo anterior "<<sueldo<<endl;
    cout<<"Nuevo sueldo "<<total<<endl;
	}
}
