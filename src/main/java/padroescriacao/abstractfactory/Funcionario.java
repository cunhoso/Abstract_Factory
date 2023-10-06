package padroescriacao.abstractfactory;

public class Funcionario {

    private Contrato contrato;
    private Demissao demissao;

    public Funcionario (FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.demissao = fabrica.createDemissao();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirDemissao() {
        return this.demissao.emitir();
    }
}