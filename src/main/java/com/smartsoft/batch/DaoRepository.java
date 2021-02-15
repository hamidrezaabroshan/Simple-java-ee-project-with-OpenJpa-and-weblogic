package com.smartsoft.batch;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;





public interface DaoRepository<T, ID extends Serializable> extends JpaRepository<T, Serializable> {

}
