# Dynamic Bean Creation with JavaEE

This repo contains a maven project that is discussed under this [blog post][post]

It showcases how JavaEE provides mechanics to dynamically create container managed beans at runtime.

## Deployment

The project should run without any problems inside the wildfly application container. 

To deploy, execute the `deploy.sh` script. Provide the path to the `standalone` directory of your Widlfly installation by means of an environment variable (`WILDFLY_HOME`)
or simply hardcode it inside the script.


## Run

Visit `http://localhost:<port>/dbc/test`. Someone should greet you.


[post]: http://localhost:4000/2016/07/dynamic-bean-creation/
