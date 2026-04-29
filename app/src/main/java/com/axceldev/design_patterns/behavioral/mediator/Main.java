package com.axceldev.design_patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        testMediator();
    }

    private static void testMediator() {
        CommunicationMediator mediator = new CommunicationMediator();
        IssuerColleague issuer = new IssuerColleague(mediator);
        ReceptorColleague receptor = new ReceptorColleague(mediator);

        mediator.setIssuer(issuer);
        mediator.setReceptor(receptor);

        issuer.send("Hello, I'm Issuer!");
        receptor.send("Hello Issuer, I'm Receptor!");
    }
}
