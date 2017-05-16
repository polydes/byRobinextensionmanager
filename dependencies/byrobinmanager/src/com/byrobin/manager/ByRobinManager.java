/*
 *
 * Created by Robin Schaafsma
 * www.byrobingames.com
 *
 */

package com.byrobin.manager;

import org.haxe.extension.Extension;
import org.haxe.lime.HaxeObject;

public class ByRobinManager extends Extension {

    private static ByRobinManager instance=null;
    
    static public ByRobinManager getInstance(){
        if(instance==null) instance = new ByRobinManager();
        
        return instance;
    }

    @Override
    public void onDestroy() {
        
        super.onDestroy();
    }
    
}




