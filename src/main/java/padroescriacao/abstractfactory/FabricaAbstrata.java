package padroescriacao.abstractfactory;

public interface FabricaAbstrata {
    Contrato createContrato();
    Demissao createDemissao();
}