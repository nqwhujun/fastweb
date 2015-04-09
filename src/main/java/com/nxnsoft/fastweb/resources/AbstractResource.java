package com.nxnsoft.fastweb.resources;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.nxnsoft.fastweb.domain.BaseDomain;
import com.nxnsoft.fastweb.service.BaseService;

/**
 * 
 * @author xnnie
 * 
 */
public abstract class AbstractResource<T extends BaseDomain> {

	private BaseService<T> baseFaseWebService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<T> list() throws SQLException {
		return baseFaseWebService.list();
	}

	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public T get(@PathParam("key") Long id) throws SQLException {
		return baseFaseWebService.getById(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(T t) throws Exception {
		baseFaseWebService.save(t);
		URI uri = UriBuilder.fromPath("/").path(t.getId().toString()).build();
		return Response.created(uri).build();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(T t) throws Exception {
		if (t.getId() == null) {
			throw new IllegalAccessError("id is null");
		}
		baseFaseWebService.updateById(t);
	}

	@Path("/{id}")
	@DELETE
	public void delete(@PathParam("key") Long id) throws SQLException {
		baseFaseWebService.deleteById(id);
	}

	public void setBaseFaseWebService(BaseService<T> baseFaseWebService) {
		this.baseFaseWebService = baseFaseWebService;
	}

}
