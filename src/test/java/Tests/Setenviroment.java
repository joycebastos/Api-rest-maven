package Tests;

import Core.BaseTest;

public class Setenviroment {
    private BaseTest baseTest;

    private String url;

    public String setEnviromentAdicionaNovoUsuario(){
        this.baseTest = new BaseTest();


        this.url = new StringBuilder()
                .append(this.baseTest.getSetupProperty("base-url"))
                .append(this.baseTest.getSetupProperty("endpoint.usuario"))
                .toString();
        return this.url;
    }

    public String setAutenticacao(){
        this.baseTest = new BaseTest();


        this.url = new StringBuilder()
                .append(this.baseTest.getSetupProperty("base-url"))
                .append(this.baseTest.getSetupProperty("endpoint.autentication"))
                .toString();
        return this.url;
    }

}
