package com.aique.solid.isp.i1;

public class OldFashionedPrinter implements Machine
{
    public void print(Document d)
    {
        // yep
    }

    public void fax(Document d) throws Exception
    {
        throw new Exception();
    }

    public void scan(Document d) throws Exception
    {
        throw new Exception();
    }
}

