package modula.platform.googledocs.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${spring.cassandra.keyspace-name}")
    String keyspace;

    @Value("${spring.cassandra.contact-points}")
    String contactPoint;

    @Override
    protected String getKeyspaceName() {
        return "processes";
    }

    @Override
    protected String getContactPoints() {
        return "cassandra:9042";
    }
}
