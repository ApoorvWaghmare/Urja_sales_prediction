package com.urja.serviceimpl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.urja.dao.ISkuDao;
import com.urja.model.Sku;
import com.urja.service.ISkuService;

@Transactional
@Service("skuService")
public class SkuServiceImpl implements ISkuService {

	private ISkuDao skuDao;

	public SkuServiceImpl(ISkuDao skuDao) {
		this.skuDao = skuDao;
	}

	@Override
	public Sku getById(int id) {
		// TODO Auto-generated method stub

		return skuDao.getById(id);
	}

	@Override
	public ArrayList<Sku> getAll() {
		// TODO Auto-generated method stub
		return skuDao.getAll();
	}

	@Override
	public ArrayList<Sku> getAllExisting() {

		return skuDao.getAllExisting();
	}

	@Override
	public ArrayList<Sku> getAllDeleted() {
		return skuDao.getAllDeleted();
	}

	@Override
	public void deleteById(int id) {
		skuDao.deleteById(id);
	}

	@Override
	public ArrayList<Sku> getByIdAndQuant(int id, int quantity) {
		return skuDao.getByIdAndQuant(id, quantity);
	}
}
