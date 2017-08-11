package com.lk.meeting.room.web.resource.finder.impl;
/**
 * Created On : 11 Aug 2017
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.meeting.room.resource.AbstractResource;
import com.lk.meeting.room.web.resource.finder.ResourceFinder;

/**
 * @author virtualpathum
 *
 */
// Not compulsory for resource finder to extends this class
public abstract class AbstractResourceFinder<R extends AbstractResource<ID>, E,
											 S extends JpaRepository<E, ID>,
											 ID extends Serializable>
											 implements ResourceFinder<R, ID> {

	protected S repo;
  

	public AbstractResourceFinder(S repo) {
		this.repo = repo;
	
	}

	/** {@inheritDoc} */
	//@Override
	public R findOne(ID id) {
		E entity = repo.findOne(id);
		return toResource(entity);
	}

	

	/** {@inheritDoc} */
	//@Override
	public Page<R> findAll(Pageable pageable) {
		Page<E> page = repo.findAll(pageable);
		return toResources(page, pageable);
	}

	

	protected Page<R> toResources(
			Page<E> entities, Pageable pageable) {

		List<R> resources = toResources(entities.getContent());
		return new PageImpl<R>(resources, pageable, entities.getTotalElements());
	}


	protected List<R> toResources(List<E> entities) {
		if (entities.isEmpty()) { return Collections.emptyList(); }

		List<R> resources = new ArrayList<R>(entities.size());
		for (E entity : entities) {
			resources.add(_toResource(entity));
		}

		return resources;
	}


	protected R _toResource(E entity) {
		return null == entity?null:toResource(entity);
	}


	protected abstract R toResource(E entity);

}
