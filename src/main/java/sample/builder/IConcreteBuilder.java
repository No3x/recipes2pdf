package sample.builder;

import sample.model.ICookbook;
import sample.model.IRecipe;

import java.io.File;

public interface IConcreteBuilder {
    File build(ICookbook cookbook) throws Exception;

    File build(IRecipe recipe) throws Exception;

    boolean builds(String filetype);
}