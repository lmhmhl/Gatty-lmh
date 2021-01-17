package cn.sp.plugin;

import cn.sp.config.ServerConfigProperties;

/**
 * Created  on 2020/12/27
 */
public abstract class AbstractShipPlugin implements ShipPlugin {

    protected ServerConfigProperties properties;

    public AbstractShipPlugin(ServerConfigProperties properties) {
        this.properties = properties;
    }
}
