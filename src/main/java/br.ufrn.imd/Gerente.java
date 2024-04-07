package br.ufrn.imd;

public class Gerente extends Funcionario{
    private Nivel nivel;

    public Gerente(int chMensal, double hh, Nivel nivel) {
        super(chMensal, hh);
        this.nivel = nivel;
    }
    @Override
    public double calcularSalario(){
        double salario = super.calcularSalario();
        return salario + nivel.getBonus();
    }
    public enum Nivel{
        JUNIOR(1000), PLENO(2000), SENIOR(3000);
        private double bonus;
        Nivel(double bonus){
            this.bonus = bonus;
        }
        public double getBonus(){
            return bonus;
        }
    }
}
