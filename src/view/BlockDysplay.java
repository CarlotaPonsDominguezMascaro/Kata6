package view;

import model.Block;

public interface BlockDysplay extends Block.Observer {

    void dysplay(Block block);

}
