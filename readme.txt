mvn -B release:prepare;

mvn -B release:rollback; 

mvn -B release:clean;

mvn -B release:update-versions -DautoVersionSubmodules=true;

mvn -B release:update-versions -DdevelopmentVersion=1.2.0-SNAPSHOT;


mvn --batch-mode -Dtag=my-proj-1.2 release:prepare \
                 -DreleaseVersion=1.2 \
                 -DdevelopmentVersion=2.0-SNAPSHOT


 mvn --batch-mode -Dtag=my-proj-1.2 -Dproject.rel.org.myCompany:projectA=1.2 \
     -Dproject.dev.org.myCompany:projectA=1.3-SNAPSHOT release:prepare            