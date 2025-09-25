package imc;

public class Pessoa {
    private float altura;
    private float peso;
    private String sexo;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.equals("M") || sexo.equals("F")) {
            this.sexo = sexo;
        }else{
            throw new IllegalArgumentException("O sexo foi informado de forma errada!");
        }
    }

    public String getIMC(){

        //IMC = peso / altura
        float imc = this.peso/(altura*altura);

        if (this.sexo.equals("F")){
            if(imc<19.1){
                return "Abaixo do peso";
            }
            else if(imc>=19.1 || imc < 25.8){
                return "No peso normal";
            }
            else if(imc>=25.8 || imc < 27.3){
                return "Marginalmente acima do peso";
            }
            else if(imc>=27.3 || imc < 32.3){
                return "Acima do peso ideal";
            }
            else{
                return "Obeso";
            }
        }
        else {
            if (imc < 20.7) {
                return "Abaixo do peso";
            }
            else if (imc < 26.4) {
                return "No peso normal";
            }
            else if (imc < 27.8) {
                return "Marginalmente acima do peso";
            }
            else if (imc < 31.1) {
                return "Acima do peso";
            }
            else {
                return "Obeso";
            }
        }
    }
}