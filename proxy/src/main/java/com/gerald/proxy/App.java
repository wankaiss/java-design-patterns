package com.gerald.proxy;

/**
 *
 * A proxy, in its most general form, is a class functioning as an interface to something else. The
 * proxy could interface to anything: a network connection, a large object in memory, a file, or
 * some other resource that is expensive or impossible to duplicate. In short, a proxy is a wrapper
 * or agent object that is being called by the client to access the real serving object behind the
 * scenes.
 * <p>
 * The Proxy design pattern allows you to provide an interface to other objects by creating a
 * wrapper class as the proxy. The wrapper class, which is the proxy, can add additional
 * functionality to the object of interest without changing the object's code.
 * <p>
 * In this example the proxy ({@link WizardTowerProxy}) controls access to the actual object (
 * {@link IvoryTower}).
 *
 */
public class App {

  public static void main(String[] args) {
    WizardTowerProxy wizardTowerProxy = new WizardTowerProxy(new IvoryTower());
    wizardTowerProxy.enter(new Wizard("red wizard"));
    wizardTowerProxy.enter(new Wizard("White wizard"));
    wizardTowerProxy.enter(new Wizard("Black wizard"));
    wizardTowerProxy.enter(new Wizard("Green wizard"));
    wizardTowerProxy.enter(new Wizard("Brown wizard"));
  }
}
