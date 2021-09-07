package com.aique.solid.ocp.o1;

public class ColorSpecification implements Specification<Product>
{
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.color == color;
    }
}
