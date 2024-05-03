package Homework26;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Controller implements KeyListener {
    private Model model;
    private View view;
    private ViewButton button;

    public Controller(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setButton(ViewButton button) {
        this.button = button;
    }

    public View getView() {
        return view;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        model.moveButton(e.getKeyCode());

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
