package com.axceldev.design_patterns.behavioral.mediator;

public class CommunicationMediator implements Mediator {

    private IssuerColleague issuer;
    private ReceptorColleague receptor;

    public void setIssuer(IssuerColleague issuer) {
        this.issuer = issuer;
    }

    public void setReceptor(ReceptorColleague receptor) {
        this.receptor = receptor;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague instanceof IssuerColleague) {
            receptor.receive(message);
        }else if (colleague instanceof ReceptorColleague) {
            issuer.receive(message);
        }
    }
}
