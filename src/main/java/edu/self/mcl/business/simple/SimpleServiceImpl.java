package edu.self.mcl.business.simple;

import javax.ejb.Stateless;

@Stateless
public class SimpleServiceImpl implements SimpleService {

    public int getRandomInt() {
        return (int) (Math.random() * 100);
    }
}
