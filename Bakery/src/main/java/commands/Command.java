package commands;

import cakes.Cake;

public interface Command {

    Cake execute(Cake cake);
}
