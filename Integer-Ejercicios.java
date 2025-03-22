class OperacionesMatInteger implements Operable<Integer> {
    private Integer valor;

    public OperacionesMatInteger(Integer valor) {
        this.valor = valor;
    }
    @Override
    public Integer suma(Integer otro) { 
        return valor + otro; 
    }
    @Override
    public Integer resta(Integer otro) { 
        return valor - otro; 
    }
    @Override
    public Integer producto(Integer otro) { 
        return valor * otro; 
    }
    @Override
    public Integer division(Integer otro) { 
        return otro != 0 ? valor / otro : 0; 
    }
    @Override
    public Integer potencia(Integer exponente) { 
        return (int) Math.pow(valor, exponente); 
    }
    @Override
    public Integer raizCuadrada() { 
        return (int) Math.sqrt(valor); 
    }
    @Override
    public Integer raizCubica() { 
        return (int) Math.cbrt(valor); 
    }
}