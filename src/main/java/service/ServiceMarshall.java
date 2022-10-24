package service;

import generated.DatosCliente;
import generated.DatosEmpresa;
import generated.Factura;

import java.io.File;
import java.math.BigInteger;

public class ServiceMarshall {
    public void marshalling(File file) {
        createInvoice();
    }

    private Factura createInvoice() {
        Factura factura = new Factura();
        factura.setNFac(new BigInteger(999));
        factura.setDatosEmpresa( createCompanyData();
        factura.setDatosFactura(createInvoice());
        factura.setDatosCliente(createCliente());



        return factura;
    }

    private DatosCliente createCliente() {
    }

    private DatosEmpresa createCompanyData() {
    }
}
