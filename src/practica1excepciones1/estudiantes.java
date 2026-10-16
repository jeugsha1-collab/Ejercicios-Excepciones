/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1excepciones1;

public class estudiantes {

    private String nombres;
    private int edad;
    private float n1, n2, n3;
    private float promedio;

    public estudiantes() {
    }

    public estudiantes(String nombres, int edad) {
        this.nombres = nombres;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mayorEdad() throws Exception {
        if (edad < 0 || edad > 105) {
            throw new Exception("Edad fuera del rango");
        } else if (edad > 18) {
            System.out.println("Eres mayor de Edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
    
    
    public void setNotas(float n1, float n2, float n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public float getPromedio() {
        return promedio;
    }

    public void calcularpromedio() throws Exception {
        if (n1 < 0 || n1 > 20 ||
            n2 < 0 || n2 > 20 ||
            n3 < 0 || n3 > 20) {

            throw new Exception("Notas fuera del rango 0-20");

        } else {
            promedio = (n1 + n2 + n3) / 3;
        }
    }
}

/*
PASOS PARA SUBIR EL PROYECTO A GITHUB:
1. Entrar a la carpeta del proyecto.
2. Inicializar Git: git init
3. Agregar archivos: git add .
4. Guardar cambios: git commit -m "Primera version"
5. Verificar remoto: git remote -v
6. Configurar el remoto si es necesario.
7. Cambiar la rama: git branch -M main
8. Subir a GitHub: git push -u origen main

PARA ACTUALIZAR:
git add .
git commit -m "Actualizar proyecto"
git push
*/