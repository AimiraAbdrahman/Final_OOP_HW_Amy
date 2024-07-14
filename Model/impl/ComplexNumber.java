package Model.impl;
import Model.MyNumber;


public class ComplexNumber extends MyNumber {

    public static final int XY = 0;
    public static final int RCIS = 1;
    public double real;
    public double imaginary;

    public ComplexNumber()
	{
		real = 0.0;
		imaginary = 0.0;
	}

    public ComplexNumber(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}

    public void set(ComplexNumber z)
	{
		this.real = z.real;
		this.imaginary = z.imaginary;
	}

    public static ComplexNumber parseComplex(String s)
	{
		s = s.replaceAll(" ","");
		ComplexNumber parsed = null;
		if(s.contains(String.valueOf("+")) || (s.contains(String.valueOf("-")) && s.lastIndexOf('-') > 0))
		{
			String re = "";
			String im = "";
			s = s.replaceAll("i","");
			s = s.replaceAll("I","");
			if(s.indexOf('+') > 0)
			{
				re = s.substring(0,s.indexOf('+'));
				im = s.substring(s.indexOf('+')+1,s.length());
				parsed = new ComplexNumber(Double.parseDouble(re),Double.parseDouble(im));
			}
			else if(s.lastIndexOf('-') > 0)
			{
				re = s.substring(0,s.lastIndexOf('-'));
				im = s.substring(s.lastIndexOf('-')+1,s.length());
				parsed = new ComplexNumber(Double.parseDouble(re),-Double.parseDouble(im));
			}
		}
		else
		{
			// Pure imaginary number
			if(s.endsWith("i") || s.endsWith("I"))
			{
				s = s.replaceAll("i","");
				s = s.replaceAll("I","");
				parsed = new ComplexNumber(0, Double.parseDouble(s));
			}
			// Pure real number
			else
			{
				parsed = new ComplexNumber(Double.parseDouble(s),0);
			}
		}
		return parsed;
	}

    @Override
	public String toString()
	{
		String re = this.real+"";
		String im = "";
		if(this.imaginary < 0)
			im = this.imaginary+"i";
		else
			im = "+"+this.imaginary+"i";
		return re+im;
	}
    
}
