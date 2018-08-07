# Spring_Docker_Sample

```

	<docker.image.prefix>thamira</docker.image.prefix>

	<plugin>
		<groupId>com.spotify</groupId>
		<artifactId>dockerfile-maven-plugin</artifactId>
		<version>1.3.6</version>
		<executions>
			<execution>
				<id>default</id>
				<goals>
					<goal>build</goal>
					<goal>push</goal>
				</goals>
			</execution>
		</executions>
		<configuration>
			<repository>${docker.image.prefix}/${project.artifactId}</repository>
			<tag>${project.version}</tag>
			<buildArgs>
				<JAR_FILE>target/${project.build.finalName}.jar</JAR_FILE>
			</buildArgs>
		</configuration>
	</plugin>

```
