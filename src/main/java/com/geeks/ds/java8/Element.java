package com.geeks.ds.java8;

public enum Element {
    HELIUM("He","Gas"),
    MAGNESIUM("Mg","Solid");
    private String chemecialSYmbol;
    private String nature;

    Element(String chemecialSYmbol, String nature) {
        this.chemecialSYmbol = chemecialSYmbol;
        this.nature = nature;
    }

    public String chemicalSymbol(){
        return chemecialSYmbol;
    }

    public String nature(){
        return nature;
    }

    public static void main(String[] args) {
        //System.out.printf("%s,%s,%s",Element.HELIUM,Element.HELIUM.chemecialSYmbol());;
        //System.out.printf("%s,%s,%s",Element[1],Element[1].);
        //System.out.printf("%s,%s,%s",Element[0],);
        System.out.printf("%s,%s,%s",Element.HELIUM.toString(),Element.HELIUM.chemecialSYmbol,Element.HELIUM.nature);
       // System.out.println(Element.HELIUM);




    }

}
