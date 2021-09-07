package com.aique.solid.ocp.o1;

public class SizeSpecification implements Specification<Product>
{
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.size == size;
    }
}
