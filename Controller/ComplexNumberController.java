package Controller;

import Model.impl.ComplexNumber;
import Service.ComplexNumberService;

public class ComplexNumberController {

    private static ComplexNumberService ComplexService = new ComplexNumberService();
    private static ComplexNumber complexNumber = new ComplexNumber();

    public static ComplexNumber parseComplex(String s) {
        return complexNumber.parseComplex(s);
    }

    public ComplexNumber add(ComplexNumber z1, ComplexNumber z2) {
        return ComplexService.add(z1, z2);
    }

    public ComplexNumber subtract(ComplexNumber z1, ComplexNumber z2) {
        return ComplexService.subtract(z1, z2);
    }

    public ComplexNumber multiply(ComplexNumber z1, ComplexNumber z2) {
        return ComplexService.multiply(z1, z2);
    }

    public ComplexNumber divide(ComplexNumber z1, ComplexNumber z2) {
        return ComplexService.divide(z1, z2);
    }

    public ComplexNumber square(ComplexNumber z1) {
        return ComplexService.square(z1);
    }

    public ComplexNumber conjugate(ComplexNumber z1) {
        return ComplexService.conjugate(z1);
    }

    public double mod(ComplexNumber z) {
        return ComplexService.mod(z);
    }

    public static ComplexNumber pow(ComplexNumber z, int power)
	{
		return ComplexService.pow(z, power);
	}

}
