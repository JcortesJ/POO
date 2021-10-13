#include <iostream>

using namespace std;
void imprimir();
void llenar_cervezas();
void diagonal_superior();
int numeros[9]= {1,2,3,4,5,6,7,8,9};
int respuesta_cerveza[3];
int cervezas [3][3];


char letras[16]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
char cafes[4][4];
void llenar_cafes();
void diagonal_inferior();
char respuesta_cafe[4];


//Codigo para problema 1
int main (){
	llenar_cervezas();
	llenar_cafes();
	imprimir();
	diagonal_superior();
	diagonal_inferior();
}

void llenar_cervezas(){
	//En esta funcion lo que hacemos es llenar la matriz de cervezas con los numeros del 1 al 9
	//La variable a nos sirve como contador para poner los numeros
		int a = 0;
	for(int i = 0; i< 3; i++){
		
		for(int j=0; j<3; j++){
			cervezas[i][j]=numeros[a] ;
			a++;
		}
		
	}
}
void imprimir(){
	//En esta funcion imprimimos las matrices para asegurarnos de que todo esté bien
	cout<<"Cervezas";
	cout<<endl;
		for(int i = 0; i< 3; i++){
		for(int j=0; j<3; j++){
			cout<<"| "<<cervezas[i][j]<<" |";
			
			
		}
		cout<<endl;
	}
	cout<<endl;
	cout<<"Cafes: "<<endl;
		for(int a = 0; a< 4; a++){
		for(int b=0; b<4; b++){
			cout<<"| "<<cafes[a][b]<<" |";
			
			
		}
		cout<<endl;
	}
}

void diagonal_superior(){
	//En esta funcion hayamos la diagonal superior, que se encuentra cuando i==j
		for(int i = 0; i< 3; i++){
		for(int j=0; j<3; j++){
			if(i==j){
				respuesta_cerveza[i] = cervezas[i][j];
			}
		}
		
	}
	cout<<endl;
	cout<<"La respuesta  (cervezas) es: ";
	for(int k = 0; k<3; k++){
		cout<<respuesta_cerveza[k]<<" ";
	}
}

//codigo para problema 2


void llenar_cafes(){
	//Aqui llenamos la matriz del cafe con un arreglo que contiene las letras. a nos sirve como contador del arreglo.
		int a = 0;
	for(int i = 0; i< 4; i++){
		
		for(int j=0; j<4; j++){
			cafes[i][j]=letras[a] ;
			a++;
		}
		
	}
}

void diagonal_inferior(){
	//para hallar la diagonal inferior, debemos iniciar desde la ultima fila y ascender (i--), e iniciar desde la primera columna y aumentar (j++)
	//se halla cuando j+i == 3.
	//j nos sirve para mostrar en orden ascendente las letras. Puesto que si usaramos i  tendríamos un orden descendente xd

		for(int i = 3; i >= 0; i--){
		for(int j = 0; j<4; j++){
			if(i+j==3){
				respuesta_cafe[j] = cafes[i][j];
				
			}
		}
		
	}
	cout<<endl;
	cout<<"La respuesta (cafes) es: ";
	for(int k = 0; k<4; k++){
		cout<<respuesta_cafe[k]<<" ";
	}
}

