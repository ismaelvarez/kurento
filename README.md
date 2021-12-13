# Kurento Services
Kurento Application Server, KMS Modules and Kurento-Fiware libraries

There must be an OCB server for the KAS

Deploy:

- Change parameters in application.properties:
  - server.address=0.0.0.0
  - server.port=8443
  - server.users=/tmp/adminUsers.txt
- Start submodules:
  - `git submodule init`
- Update submodules
	- `git submodule update`
- Compile and install:
	- `mvn clean compile install package`
