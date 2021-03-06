package io.cattle.platform.servicediscovery.api.constants;


public class ServiceDiscoveryConstants {

    public static final String FIELD_SCALE = "scale";
    public static final String FIELD_NETWORK_ID = "networkId";
    public static final String FIELD_SERVICE_ID = "serviceId";
    public static final String FIELD_SERVICE_IDS = "serviceIds";
    public static final String FIELD_ACTIVATE_CONSUMED_SERVICES = "activateConsumedServices";
    public static final String FIELD_LAUNCH_CONFIG = "launchConfig";

    public static final String ACTION_SERVICE_ACTIVATE = "activate";
    public static final String ACTION_SERVICE_CREATE = "create";
    public static final String ACTION_SERVICE_ADD_SERVICE_LINK = "addservicelink";
    public static final String ACTION_SERVICE_REMOVE_SERVICE_LINK = "removeservicelink";
    public static final String ACTION_ENV_ACTIVATE_SERVICES = "activateservices";

    public static final String PROCESS_SERVICE_ACTIVATE = "service." + ACTION_SERVICE_ACTIVATE;
    public static final String PROCESS_SERVICE_CREATE = "service." + ACTION_SERVICE_CREATE;
    public static final String PROCESS_ENV_ACTIVATE_SERVICES = "environment." + ACTION_ENV_ACTIVATE_SERVICES;
    public static final String PROCESS_ENV_DEACTIVATE_SERVICES = "environment.deactivateservices";
    public static final String PROCESS_ENV_REMOVE = "environment.remove";
    public static final String PROCESS_SERVICE_DEACTIVATE = "service.deactivate";
    public static final String PROCESS_SERVICE_REMOVE = "service.remove";
    public static final String PROCESS_SERVICE_INSTANCE_MAP_REMOVE = "serviceexposemap.remove";
    public static final String PROCESS_ENV_EXPORT_CONFIG = "environment.exportconfig";
    public static final String PROCESS_SERVICE_ADD_SERVICE_LINK = "service." + ACTION_SERVICE_ADD_SERVICE_LINK;
    public static final String PROCESS_SERVICE_REMOVE_SERVICE_LINK = "service." + ACTION_SERVICE_REMOVE_SERVICE_LINK;
    public static final String PROCESS_SERVICE_CONSUME_MAP_CREATE = "serviceconsumemap.create";
    public static final String PROCESS_SERVICE_CONSUME_MAP_REMOVE = "serviceconsumemap.remove";

}