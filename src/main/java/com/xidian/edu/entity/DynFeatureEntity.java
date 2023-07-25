package com.xidian.edu.entity;

import java.util.Objects;

/**
 * @author ljz990305
 * @create 2023-07-24 22:17
 */
public class DynFeatureEntity {
    private int id;
    private String APPLICATION_NAME;
    private int DATASET;
    private int totInstruction;
    private int ILP32;
    private int ILP64;
    private int ILP128;
    private int ILP256;
    private int total_ins_count_for_hpc_alignment;
    private int mem_read;
    private int mem_write;
    private int control_flow;
    private int arithmetic;
    private int floating_point;
    private int stack;
    private int shift;
    private int string;
    private int sse;
    private int other;
    private int nop;
    private int InstrFootprint64;
    private int InstrFootprint4k;
    private int DataFootprint64;
    private int DataFootprint4k;
    private int mem_access;
    private int cold_ref_cnt;
    private int memReuseDist0_2;
    private int memReuseDist2_4;
    private int memReuseDist4_8;
    private int memReuseDist8_16;
    private int memReuseDist16_32;
    private int memReuseDist32_64;
    private int memReuseDist64_128;
    private int memReuseDist128_256;
    private int memReuseDist256_512;
    private int memReuseDist512_1k;
    private int memReuseDist1k_2k;
    private int memReuseDist2k_4k;
    private int memReuseDist4k_8k;
    private int memReuseDist8k_16k;
    private int memReuseDist16k_32k;
    private int memReuseDist32k_64k;
    private int memReuseDist64k_128k;
    private int memReuseDist128k_256k;
    private int memReuseDist256k_512k;
    private int GAg_mispred_cnt_4bits;
    private int PAg_mispred_cnt_4bits;
    private int GAs_mispred_cnt_4bits;
    private int PAs_mispred_cnt_4bits;
    private int GAg_mispred_cnt_8bits;
    private int PAg_mispred_cnt_8bits;
    private int GAs_mispred_cnt_8bits;
    private int PAs_mispred_cnt_8bits;
    private int GAg_mispred_cnt_12bits;
    private int PAg_mispred_cnt_12bits;
    private int GAs_mispred_cnt_12bits;
    private int PAs_mispred_cnt_12bits;
    private int total_brCount;
    private int total_transactionCount;
    private int total_takenCount;
    private int total_num_ops;
    private int instr_reg_cnt;
    private int total_reg_use_cnt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynFeatureEntity that = (DynFeatureEntity) o;
        return id == that.id &&
                DATASET == that.DATASET &&
                totInstruction == that.totInstruction &&
                ILP32 == that.ILP32 &&
                ILP64 == that.ILP64 &&
                ILP128 == that.ILP128 &&
                ILP256 == that.ILP256 &&
                total_ins_count_for_hpc_alignment == that.total_ins_count_for_hpc_alignment &&
                mem_read == that.mem_read &&
                mem_write == that.mem_write &&
                control_flow == that.control_flow &&
                arithmetic == that.arithmetic &&
                floating_point == that.floating_point &&
                stack == that.stack &&
                shift == that.shift &&
                string == that.string &&
                sse == that.sse &&
                other == that.other &&
                nop == that.nop &&
                InstrFootprint64 == that.InstrFootprint64 &&
                InstrFootprint4k == that.InstrFootprint4k &&
                DataFootprint64 == that.DataFootprint64 &&
                DataFootprint4k == that.DataFootprint4k &&
                mem_access == that.mem_access &&
                cold_ref_cnt == that.cold_ref_cnt &&
                memReuseDist0_2 == that.memReuseDist0_2 &&
                memReuseDist2_4 == that.memReuseDist2_4 &&
                memReuseDist4_8 == that.memReuseDist4_8 &&
                memReuseDist8_16 == that.memReuseDist8_16 &&
                memReuseDist16_32 == that.memReuseDist16_32 &&
                memReuseDist32_64 == that.memReuseDist32_64 &&
                memReuseDist64_128 == that.memReuseDist64_128 &&
                memReuseDist128_256 == that.memReuseDist128_256 &&
                memReuseDist256_512 == that.memReuseDist256_512 &&
                memReuseDist512_1k == that.memReuseDist512_1k &&
                memReuseDist1k_2k == that.memReuseDist1k_2k &&
                memReuseDist2k_4k == that.memReuseDist2k_4k &&
                memReuseDist4k_8k == that.memReuseDist4k_8k &&
                memReuseDist8k_16k == that.memReuseDist8k_16k &&
                memReuseDist16k_32k == that.memReuseDist16k_32k &&
                memReuseDist32k_64k == that.memReuseDist32k_64k &&
                memReuseDist64k_128k == that.memReuseDist64k_128k &&
                memReuseDist128k_256k == that.memReuseDist128k_256k &&
                memReuseDist256k_512k == that.memReuseDist256k_512k &&
                GAg_mispred_cnt_4bits == that.GAg_mispred_cnt_4bits &&
                PAg_mispred_cnt_4bits == that.PAg_mispred_cnt_4bits &&
                GAs_mispred_cnt_4bits == that.GAs_mispred_cnt_4bits &&
                PAs_mispred_cnt_4bits == that.PAs_mispred_cnt_4bits &&
                GAg_mispred_cnt_8bits == that.GAg_mispred_cnt_8bits &&
                PAg_mispred_cnt_8bits == that.PAg_mispred_cnt_8bits &&
                GAs_mispred_cnt_8bits == that.GAs_mispred_cnt_8bits &&
                PAs_mispred_cnt_8bits == that.PAs_mispred_cnt_8bits &&
                GAg_mispred_cnt_12bits == that.GAg_mispred_cnt_12bits &&
                PAg_mispred_cnt_12bits == that.PAg_mispred_cnt_12bits &&
                GAs_mispred_cnt_12bits == that.GAs_mispred_cnt_12bits &&
                PAs_mispred_cnt_12bits == that.PAs_mispred_cnt_12bits &&
                total_brCount == that.total_brCount &&
                total_transactionCount == that.total_transactionCount &&
                total_takenCount == that.total_takenCount &&
                total_num_ops == that.total_num_ops &&
                instr_reg_cnt == that.instr_reg_cnt &&
                total_reg_use_cnt == that.total_reg_use_cnt &&
                total_reg_age == that.total_reg_age &&
                reg_age_cnt_1 == that.reg_age_cnt_1 &&
                reg_age_cnt_2 == that.reg_age_cnt_2 &&
                reg_age_cnt_4 == that.reg_age_cnt_4 &&
                reg_age_cnt_8 == that.reg_age_cnt_8 &&
                reg_age_cnt_16 == that.reg_age_cnt_16 &&
                reg_age_cnt_32 == that.reg_age_cnt_32 &&
                reg_age_cnt_64 == that.reg_age_cnt_64 &&
                mem_read_cnt == that.mem_read_cnt &&
                mem_read_local_stride_0 == that.mem_read_local_stride_0 &&
                mem_read_local_stride_8 == that.mem_read_local_stride_8 &&
                mem_read_local_stride_64 == that.mem_read_local_stride_64 &&
                mem_read_local_stride_512 == that.mem_read_local_stride_512 &&
                mem_read_local_stride_4096 == that.mem_read_local_stride_4096 &&
                mem_read_local_stride_32768 == that.mem_read_local_stride_32768 &&
                mem_read_local_stride_262144 == that.mem_read_local_stride_262144 &&
                mem_read_global_stride_0 == that.mem_read_global_stride_0 &&
                mem_read_global_stride_8 == that.mem_read_global_stride_8 &&
                mem_read_global_stride_64 == that.mem_read_global_stride_64 &&
                mem_read_global_stride_512 == that.mem_read_global_stride_512 &&
                mem_read_global_stride_4096 == that.mem_read_global_stride_4096 &&
                mem_read_global_stride_32768 == that.mem_read_global_stride_32768 &&
                mem_read_global_stride_262144 == that.mem_read_global_stride_262144 &&
                mem_write_cnt == that.mem_write_cnt &&
                mem_write_local_stride_0 == that.mem_write_local_stride_0 &&
                mem_write_local_stride_8 == that.mem_write_local_stride_8 &&
                mem_write_local_stride_64 == that.mem_write_local_stride_64 &&
                mem_write_local_stride_512 == that.mem_write_local_stride_512 &&
                mem_write_local_stride_4096 == that.mem_write_local_stride_4096 &&
                mem_write_local_stride_32768 == that.mem_write_local_stride_32768 &&
                mem_write_local_stride_262144 == that.mem_write_local_stride_262144 &&
                mem_write_global_stride_0 == that.mem_write_global_stride_0 &&
                mem_write_global_stride_8 == that.mem_write_global_stride_8 &&
                mem_write_global_stride_64 == that.mem_write_global_stride_64 &&
                mem_write_global_stride_512 == that.mem_write_global_stride_512 &&
                mem_write_global_stride_4096 == that.mem_write_global_stride_4096 &&
                mem_write_global_stride_32768 == that.mem_write_global_stride_32768 &&
                mem_write_global_stride_262144 == that.mem_write_global_stride_262144 &&
                Objects.equals(APPLICATION_NAME, that.APPLICATION_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, APPLICATION_NAME, DATASET, totInstruction, ILP32, ILP64, ILP128, ILP256, total_ins_count_for_hpc_alignment, mem_read, mem_write, control_flow, arithmetic, floating_point, stack, shift, string, sse, other, nop, InstrFootprint64, InstrFootprint4k, DataFootprint64, DataFootprint4k, mem_access, cold_ref_cnt, memReuseDist0_2, memReuseDist2_4, memReuseDist4_8, memReuseDist8_16, memReuseDist16_32, memReuseDist32_64, memReuseDist64_128, memReuseDist128_256, memReuseDist256_512, memReuseDist512_1k, memReuseDist1k_2k, memReuseDist2k_4k, memReuseDist4k_8k, memReuseDist8k_16k, memReuseDist16k_32k, memReuseDist32k_64k, memReuseDist64k_128k, memReuseDist128k_256k, memReuseDist256k_512k, GAg_mispred_cnt_4bits, PAg_mispred_cnt_4bits, GAs_mispred_cnt_4bits, PAs_mispred_cnt_4bits, GAg_mispred_cnt_8bits, PAg_mispred_cnt_8bits, GAs_mispred_cnt_8bits, PAs_mispred_cnt_8bits, GAg_mispred_cnt_12bits, PAg_mispred_cnt_12bits, GAs_mispred_cnt_12bits, PAs_mispred_cnt_12bits, total_brCount, total_transactionCount, total_takenCount, total_num_ops, instr_reg_cnt, total_reg_use_cnt, total_reg_age, reg_age_cnt_1, reg_age_cnt_2, reg_age_cnt_4, reg_age_cnt_8, reg_age_cnt_16, reg_age_cnt_32, reg_age_cnt_64, mem_read_cnt, mem_read_local_stride_0, mem_read_local_stride_8, mem_read_local_stride_64, mem_read_local_stride_512, mem_read_local_stride_4096, mem_read_local_stride_32768, mem_read_local_stride_262144, mem_read_global_stride_0, mem_read_global_stride_8, mem_read_global_stride_64, mem_read_global_stride_512, mem_read_global_stride_4096, mem_read_global_stride_32768, mem_read_global_stride_262144, mem_write_cnt, mem_write_local_stride_0, mem_write_local_stride_8, mem_write_local_stride_64, mem_write_local_stride_512, mem_write_local_stride_4096, mem_write_local_stride_32768, mem_write_local_stride_262144, mem_write_global_stride_0, mem_write_global_stride_8, mem_write_global_stride_64, mem_write_global_stride_512, mem_write_global_stride_4096, mem_write_global_stride_32768, mem_write_global_stride_262144);
    }

    @Override
    public String toString() {
        return "StaticFeatureEntity{" +
                "id=" + id +
                ", APPLICATION_NAME='" + APPLICATION_NAME + '\'' +
                ", DATASET=" + DATASET +
                ", totInstruction=" + totInstruction +
                ", ILP32=" + ILP32 +
                ", ILP64=" + ILP64 +
                ", ILP128=" + ILP128 +
                ", ILP256=" + ILP256 +
                ", total_ins_count_for_hpc_alignment=" + total_ins_count_for_hpc_alignment +
                ", mem_read=" + mem_read +
                ", mem_write=" + mem_write +
                ", control_flow=" + control_flow +
                ", arithmetic=" + arithmetic +
                ", floating_point=" + floating_point +
                ", stack=" + stack +
                ", shift=" + shift +
                ", string=" + string +
                ", sse=" + sse +
                ", other=" + other +
                ", nop=" + nop +
                ", InstrFootprint64=" + InstrFootprint64 +
                ", InstrFootprint4k=" + InstrFootprint4k +
                ", DataFootprint64=" + DataFootprint64 +
                ", DataFootprint4k=" + DataFootprint4k +
                ", mem_access=" + mem_access +
                ", cold_ref_cnt=" + cold_ref_cnt +
                ", memReuseDist0_2=" + memReuseDist0_2 +
                ", memReuseDist2_4=" + memReuseDist2_4 +
                ", memReuseDist4_8=" + memReuseDist4_8 +
                ", memReuseDist8_16=" + memReuseDist8_16 +
                ", memReuseDist16_32=" + memReuseDist16_32 +
                ", memReuseDist32_64=" + memReuseDist32_64 +
                ", memReuseDist64_128=" + memReuseDist64_128 +
                ", memReuseDist128_256=" + memReuseDist128_256 +
                ", memReuseDist256_512=" + memReuseDist256_512 +
                ", memReuseDist512_1k=" + memReuseDist512_1k +
                ", memReuseDist1k_2k=" + memReuseDist1k_2k +
                ", memReuseDist2k_4k=" + memReuseDist2k_4k +
                ", memReuseDist4k_8k=" + memReuseDist4k_8k +
                ", memReuseDist8k_16k=" + memReuseDist8k_16k +
                ", memReuseDist16k_32k=" + memReuseDist16k_32k +
                ", memReuseDist32k_64k=" + memReuseDist32k_64k +
                ", memReuseDist64k_128k=" + memReuseDist64k_128k +
                ", memReuseDist128k_256k=" + memReuseDist128k_256k +
                ", memReuseDist256k_512k=" + memReuseDist256k_512k +
                ", GAg_mispred_cnt_4bits=" + GAg_mispred_cnt_4bits +
                ", PAg_mispred_cnt_4bits=" + PAg_mispred_cnt_4bits +
                ", GAs_mispred_cnt_4bits=" + GAs_mispred_cnt_4bits +
                ", PAs_mispred_cnt_4bits=" + PAs_mispred_cnt_4bits +
                ", GAg_mispred_cnt_8bits=" + GAg_mispred_cnt_8bits +
                ", PAg_mispred_cnt_8bits=" + PAg_mispred_cnt_8bits +
                ", GAs_mispred_cnt_8bits=" + GAs_mispred_cnt_8bits +
                ", PAs_mispred_cnt_8bits=" + PAs_mispred_cnt_8bits +
                ", GAg_mispred_cnt_12bits=" + GAg_mispred_cnt_12bits +
                ", PAg_mispred_cnt_12bits=" + PAg_mispred_cnt_12bits +
                ", GAs_mispred_cnt_12bits=" + GAs_mispred_cnt_12bits +
                ", PAs_mispred_cnt_12bits=" + PAs_mispred_cnt_12bits +
                ", total_brCount=" + total_brCount +
                ", total_transactionCount=" + total_transactionCount +
                ", total_takenCount=" + total_takenCount +
                ", total_num_ops=" + total_num_ops +
                ", instr_reg_cnt=" + instr_reg_cnt +
                ", total_reg_use_cnt=" + total_reg_use_cnt +
                ", total_reg_age=" + total_reg_age +
                ", reg_age_cnt_1=" + reg_age_cnt_1 +
                ", reg_age_cnt_2=" + reg_age_cnt_2 +
                ", reg_age_cnt_4=" + reg_age_cnt_4 +
                ", reg_age_cnt_8=" + reg_age_cnt_8 +
                ", reg_age_cnt_16=" + reg_age_cnt_16 +
                ", reg_age_cnt_32=" + reg_age_cnt_32 +
                ", reg_age_cnt_64=" + reg_age_cnt_64 +
                ", mem_read_cnt=" + mem_read_cnt +
                ", mem_read_local_stride_0=" + mem_read_local_stride_0 +
                ", mem_read_local_stride_8=" + mem_read_local_stride_8 +
                ", mem_read_local_stride_64=" + mem_read_local_stride_64 +
                ", mem_read_local_stride_512=" + mem_read_local_stride_512 +
                ", mem_read_local_stride_4096=" + mem_read_local_stride_4096 +
                ", mem_read_local_stride_32768=" + mem_read_local_stride_32768 +
                ", mem_read_local_stride_262144=" + mem_read_local_stride_262144 +
                ", mem_read_global_stride_0=" + mem_read_global_stride_0 +
                ", mem_read_global_stride_8=" + mem_read_global_stride_8 +
                ", mem_read_global_stride_64=" + mem_read_global_stride_64 +
                ", mem_read_global_stride_512=" + mem_read_global_stride_512 +
                ", mem_read_global_stride_4096=" + mem_read_global_stride_4096 +
                ", mem_read_global_stride_32768=" + mem_read_global_stride_32768 +
                ", mem_read_global_stride_262144=" + mem_read_global_stride_262144 +
                ", mem_write_cnt=" + mem_write_cnt +
                ", mem_write_local_stride_0=" + mem_write_local_stride_0 +
                ", mem_write_local_stride_8=" + mem_write_local_stride_8 +
                ", mem_write_local_stride_64=" + mem_write_local_stride_64 +
                ", mem_write_local_stride_512=" + mem_write_local_stride_512 +
                ", mem_write_local_stride_4096=" + mem_write_local_stride_4096 +
                ", mem_write_local_stride_32768=" + mem_write_local_stride_32768 +
                ", mem_write_local_stride_262144=" + mem_write_local_stride_262144 +
                ", mem_write_global_stride_0=" + mem_write_global_stride_0 +
                ", mem_write_global_stride_8=" + mem_write_global_stride_8 +
                ", mem_write_global_stride_64=" + mem_write_global_stride_64 +
                ", mem_write_global_stride_512=" + mem_write_global_stride_512 +
                ", mem_write_global_stride_4096=" + mem_write_global_stride_4096 +
                ", mem_write_global_stride_32768=" + mem_write_global_stride_32768 +
                ", mem_write_global_stride_262144=" + mem_write_global_stride_262144 +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAPPLICATION_NAME() {
        return APPLICATION_NAME;
    }

    public void setAPPLICATION_NAME(String APPLICATION_NAME) {
        this.APPLICATION_NAME = APPLICATION_NAME;
    }

    public int getDATASET() {
        return DATASET;
    }

    public void setDATASET(int DATASET) {
        this.DATASET = DATASET;
    }

    public int getTotInstruction() {
        return totInstruction;
    }

    public void setTotInstruction(int totInstruction) {
        this.totInstruction = totInstruction;
    }

    public int getILP32() {
        return ILP32;
    }

    public void setILP32(int ILP32) {
        this.ILP32 = ILP32;
    }

    public int getILP64() {
        return ILP64;
    }

    public void setILP64(int ILP64) {
        this.ILP64 = ILP64;
    }

    public int getILP128() {
        return ILP128;
    }

    public void setILP128(int ILP128) {
        this.ILP128 = ILP128;
    }

    public int getILP256() {
        return ILP256;
    }

    public void setILP256(int ILP256) {
        this.ILP256 = ILP256;
    }

    public int getTotal_ins_count_for_hpc_alignment() {
        return total_ins_count_for_hpc_alignment;
    }

    public void setTotal_ins_count_for_hpc_alignment(int total_ins_count_for_hpc_alignment) {
        this.total_ins_count_for_hpc_alignment = total_ins_count_for_hpc_alignment;
    }

    public int getMem_read() {
        return mem_read;
    }

    public void setMem_read(int mem_read) {
        this.mem_read = mem_read;
    }

    public int getMem_write() {
        return mem_write;
    }

    public void setMem_write(int mem_write) {
        this.mem_write = mem_write;
    }

    public int getControl_flow() {
        return control_flow;
    }

    public void setControl_flow(int control_flow) {
        this.control_flow = control_flow;
    }

    public int getArithmetic() {
        return arithmetic;
    }

    public void setArithmetic(int arithmetic) {
        this.arithmetic = arithmetic;
    }

    public int getFloating_point() {
        return floating_point;
    }

    public void setFloating_point(int floating_point) {
        this.floating_point = floating_point;
    }

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getString() {
        return string;
    }

    public void setString(int string) {
        this.string = string;
    }

    public int getSse() {
        return sse;
    }

    public void setSse(int sse) {
        this.sse = sse;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }

    public int getNop() {
        return nop;
    }

    public void setNop(int nop) {
        this.nop = nop;
    }

    public int getInstrFootprint64() {
        return InstrFootprint64;
    }

    public void setInstrFootprint64(int instrFootprint64) {
        InstrFootprint64 = instrFootprint64;
    }

    public int getInstrFootprint4k() {
        return InstrFootprint4k;
    }

    public void setInstrFootprint4k(int instrFootprint4k) {
        InstrFootprint4k = instrFootprint4k;
    }

    public int getDataFootprint64() {
        return DataFootprint64;
    }

    public void setDataFootprint64(int dataFootprint64) {
        DataFootprint64 = dataFootprint64;
    }

    public int getDataFootprint4k() {
        return DataFootprint4k;
    }

    public void setDataFootprint4k(int dataFootprint4k) {
        DataFootprint4k = dataFootprint4k;
    }

    public int getMem_access() {
        return mem_access;
    }

    public void setMem_access(int mem_access) {
        this.mem_access = mem_access;
    }

    public int getCold_ref_cnt() {
        return cold_ref_cnt;
    }

    public void setCold_ref_cnt(int cold_ref_cnt) {
        this.cold_ref_cnt = cold_ref_cnt;
    }

    public int getMemReuseDist0_2() {
        return memReuseDist0_2;
    }

    public void setMemReuseDist0_2(int memReuseDist0_2) {
        this.memReuseDist0_2 = memReuseDist0_2;
    }

    public int getMemReuseDist2_4() {
        return memReuseDist2_4;
    }

    public void setMemReuseDist2_4(int memReuseDist2_4) {
        this.memReuseDist2_4 = memReuseDist2_4;
    }

    public int getMemReuseDist4_8() {
        return memReuseDist4_8;
    }

    public void setMemReuseDist4_8(int memReuseDist4_8) {
        this.memReuseDist4_8 = memReuseDist4_8;
    }

    public int getMemReuseDist8_16() {
        return memReuseDist8_16;
    }

    public void setMemReuseDist8_16(int memReuseDist8_16) {
        this.memReuseDist8_16 = memReuseDist8_16;
    }

    public int getMemReuseDist16_32() {
        return memReuseDist16_32;
    }

    public void setMemReuseDist16_32(int memReuseDist16_32) {
        this.memReuseDist16_32 = memReuseDist16_32;
    }

    public int getMemReuseDist32_64() {
        return memReuseDist32_64;
    }

    public void setMemReuseDist32_64(int memReuseDist32_64) {
        this.memReuseDist32_64 = memReuseDist32_64;
    }

    public int getMemReuseDist64_128() {
        return memReuseDist64_128;
    }

    public void setMemReuseDist64_128(int memReuseDist64_128) {
        this.memReuseDist64_128 = memReuseDist64_128;
    }

    public int getMemReuseDist128_256() {
        return memReuseDist128_256;
    }

    public void setMemReuseDist128_256(int memReuseDist128_256) {
        this.memReuseDist128_256 = memReuseDist128_256;
    }

    public int getMemReuseDist256_512() {
        return memReuseDist256_512;
    }

    public void setMemReuseDist256_512(int memReuseDist256_512) {
        this.memReuseDist256_512 = memReuseDist256_512;
    }

    public int getMemReuseDist512_1k() {
        return memReuseDist512_1k;
    }

    public void setMemReuseDist512_1k(int memReuseDist512_1k) {
        this.memReuseDist512_1k = memReuseDist512_1k;
    }

    public int getMemReuseDist1k_2k() {
        return memReuseDist1k_2k;
    }

    public void setMemReuseDist1k_2k(int memReuseDist1k_2k) {
        this.memReuseDist1k_2k = memReuseDist1k_2k;
    }

    public int getMemReuseDist2k_4k() {
        return memReuseDist2k_4k;
    }

    public void setMemReuseDist2k_4k(int memReuseDist2k_4k) {
        this.memReuseDist2k_4k = memReuseDist2k_4k;
    }

    public int getMemReuseDist4k_8k() {
        return memReuseDist4k_8k;
    }

    public void setMemReuseDist4k_8k(int memReuseDist4k_8k) {
        this.memReuseDist4k_8k = memReuseDist4k_8k;
    }

    public int getMemReuseDist8k_16k() {
        return memReuseDist8k_16k;
    }

    public void setMemReuseDist8k_16k(int memReuseDist8k_16k) {
        this.memReuseDist8k_16k = memReuseDist8k_16k;
    }

    public int getMemReuseDist16k_32k() {
        return memReuseDist16k_32k;
    }

    public void setMemReuseDist16k_32k(int memReuseDist16k_32k) {
        this.memReuseDist16k_32k = memReuseDist16k_32k;
    }

    public int getMemReuseDist32k_64k() {
        return memReuseDist32k_64k;
    }

    public void setMemReuseDist32k_64k(int memReuseDist32k_64k) {
        this.memReuseDist32k_64k = memReuseDist32k_64k;
    }

    public int getMemReuseDist64k_128k() {
        return memReuseDist64k_128k;
    }

    public void setMemReuseDist64k_128k(int memReuseDist64k_128k) {
        this.memReuseDist64k_128k = memReuseDist64k_128k;
    }

    public int getMemReuseDist128k_256k() {
        return memReuseDist128k_256k;
    }

    public void setMemReuseDist128k_256k(int memReuseDist128k_256k) {
        this.memReuseDist128k_256k = memReuseDist128k_256k;
    }

    public int getMemReuseDist256k_512k() {
        return memReuseDist256k_512k;
    }

    public void setMemReuseDist256k_512k(int memReuseDist256k_512k) {
        this.memReuseDist256k_512k = memReuseDist256k_512k;
    }

    public int getGAg_mispred_cnt_4bits() {
        return GAg_mispred_cnt_4bits;
    }

    public void setGAg_mispred_cnt_4bits(int GAg_mispred_cnt_4bits) {
        this.GAg_mispred_cnt_4bits = GAg_mispred_cnt_4bits;
    }

    public int getPAg_mispred_cnt_4bits() {
        return PAg_mispred_cnt_4bits;
    }

    public void setPAg_mispred_cnt_4bits(int PAg_mispred_cnt_4bits) {
        this.PAg_mispred_cnt_4bits = PAg_mispred_cnt_4bits;
    }

    public int getGAs_mispred_cnt_4bits() {
        return GAs_mispred_cnt_4bits;
    }

    public void setGAs_mispred_cnt_4bits(int GAs_mispred_cnt_4bits) {
        this.GAs_mispred_cnt_4bits = GAs_mispred_cnt_4bits;
    }

    public int getPAs_mispred_cnt_4bits() {
        return PAs_mispred_cnt_4bits;
    }

    public void setPAs_mispred_cnt_4bits(int PAs_mispred_cnt_4bits) {
        this.PAs_mispred_cnt_4bits = PAs_mispred_cnt_4bits;
    }

    public int getGAg_mispred_cnt_8bits() {
        return GAg_mispred_cnt_8bits;
    }

    public void setGAg_mispred_cnt_8bits(int GAg_mispred_cnt_8bits) {
        this.GAg_mispred_cnt_8bits = GAg_mispred_cnt_8bits;
    }

    public int getPAg_mispred_cnt_8bits() {
        return PAg_mispred_cnt_8bits;
    }

    public void setPAg_mispred_cnt_8bits(int PAg_mispred_cnt_8bits) {
        this.PAg_mispred_cnt_8bits = PAg_mispred_cnt_8bits;
    }

    public int getGAs_mispred_cnt_8bits() {
        return GAs_mispred_cnt_8bits;
    }

    public void setGAs_mispred_cnt_8bits(int GAs_mispred_cnt_8bits) {
        this.GAs_mispred_cnt_8bits = GAs_mispred_cnt_8bits;
    }

    public int getPAs_mispred_cnt_8bits() {
        return PAs_mispred_cnt_8bits;
    }

    public void setPAs_mispred_cnt_8bits(int PAs_mispred_cnt_8bits) {
        this.PAs_mispred_cnt_8bits = PAs_mispred_cnt_8bits;
    }

    public int getGAg_mispred_cnt_12bits() {
        return GAg_mispred_cnt_12bits;
    }

    public void setGAg_mispred_cnt_12bits(int GAg_mispred_cnt_12bits) {
        this.GAg_mispred_cnt_12bits = GAg_mispred_cnt_12bits;
    }

    public int getPAg_mispred_cnt_12bits() {
        return PAg_mispred_cnt_12bits;
    }

    public void setPAg_mispred_cnt_12bits(int PAg_mispred_cnt_12bits) {
        this.PAg_mispred_cnt_12bits = PAg_mispred_cnt_12bits;
    }

    public int getGAs_mispred_cnt_12bits() {
        return GAs_mispred_cnt_12bits;
    }

    public void setGAs_mispred_cnt_12bits(int GAs_mispred_cnt_12bits) {
        this.GAs_mispred_cnt_12bits = GAs_mispred_cnt_12bits;
    }

    public int getPAs_mispred_cnt_12bits() {
        return PAs_mispred_cnt_12bits;
    }

    public void setPAs_mispred_cnt_12bits(int PAs_mispred_cnt_12bits) {
        this.PAs_mispred_cnt_12bits = PAs_mispred_cnt_12bits;
    }

    public int getTotal_brCount() {
        return total_brCount;
    }

    public void setTotal_brCount(int total_brCount) {
        this.total_brCount = total_brCount;
    }

    public int getTotal_transactionCount() {
        return total_transactionCount;
    }

    public void setTotal_transactionCount(int total_transactionCount) {
        this.total_transactionCount = total_transactionCount;
    }

    public int getTotal_takenCount() {
        return total_takenCount;
    }

    public void setTotal_takenCount(int total_takenCount) {
        this.total_takenCount = total_takenCount;
    }

    public int getTotal_num_ops() {
        return total_num_ops;
    }

    public void setTotal_num_ops(int total_num_ops) {
        this.total_num_ops = total_num_ops;
    }

    public int getInstr_reg_cnt() {
        return instr_reg_cnt;
    }

    public void setInstr_reg_cnt(int instr_reg_cnt) {
        this.instr_reg_cnt = instr_reg_cnt;
    }

    public int getTotal_reg_use_cnt() {
        return total_reg_use_cnt;
    }

    public void setTotal_reg_use_cnt(int total_reg_use_cnt) {
        this.total_reg_use_cnt = total_reg_use_cnt;
    }

    public int getTotal_reg_age() {
        return total_reg_age;
    }

    public void setTotal_reg_age(int total_reg_age) {
        this.total_reg_age = total_reg_age;
    }

    public int getReg_age_cnt_1() {
        return reg_age_cnt_1;
    }

    public void setReg_age_cnt_1(int reg_age_cnt_1) {
        this.reg_age_cnt_1 = reg_age_cnt_1;
    }

    public int getReg_age_cnt_2() {
        return reg_age_cnt_2;
    }

    public void setReg_age_cnt_2(int reg_age_cnt_2) {
        this.reg_age_cnt_2 = reg_age_cnt_2;
    }

    public int getReg_age_cnt_4() {
        return reg_age_cnt_4;
    }

    public void setReg_age_cnt_4(int reg_age_cnt_4) {
        this.reg_age_cnt_4 = reg_age_cnt_4;
    }

    public int getReg_age_cnt_8() {
        return reg_age_cnt_8;
    }

    public void setReg_age_cnt_8(int reg_age_cnt_8) {
        this.reg_age_cnt_8 = reg_age_cnt_8;
    }

    public int getReg_age_cnt_16() {
        return reg_age_cnt_16;
    }

    public void setReg_age_cnt_16(int reg_age_cnt_16) {
        this.reg_age_cnt_16 = reg_age_cnt_16;
    }

    public int getReg_age_cnt_32() {
        return reg_age_cnt_32;
    }

    public void setReg_age_cnt_32(int reg_age_cnt_32) {
        this.reg_age_cnt_32 = reg_age_cnt_32;
    }

    public int getReg_age_cnt_64() {
        return reg_age_cnt_64;
    }

    public void setReg_age_cnt_64(int reg_age_cnt_64) {
        this.reg_age_cnt_64 = reg_age_cnt_64;
    }

    public int getMem_read_cnt() {
        return mem_read_cnt;
    }

    public void setMem_read_cnt(int mem_read_cnt) {
        this.mem_read_cnt = mem_read_cnt;
    }

    public int getMem_read_local_stride_0() {
        return mem_read_local_stride_0;
    }

    public void setMem_read_local_stride_0(int mem_read_local_stride_0) {
        this.mem_read_local_stride_0 = mem_read_local_stride_0;
    }

    public int getMem_read_local_stride_8() {
        return mem_read_local_stride_8;
    }

    public void setMem_read_local_stride_8(int mem_read_local_stride_8) {
        this.mem_read_local_stride_8 = mem_read_local_stride_8;
    }

    public int getMem_read_local_stride_64() {
        return mem_read_local_stride_64;
    }

    public void setMem_read_local_stride_64(int mem_read_local_stride_64) {
        this.mem_read_local_stride_64 = mem_read_local_stride_64;
    }

    public int getMem_read_local_stride_512() {
        return mem_read_local_stride_512;
    }

    public void setMem_read_local_stride_512(int mem_read_local_stride_512) {
        this.mem_read_local_stride_512 = mem_read_local_stride_512;
    }

    public int getMem_read_local_stride_4096() {
        return mem_read_local_stride_4096;
    }

    public void setMem_read_local_stride_4096(int mem_read_local_stride_4096) {
        this.mem_read_local_stride_4096 = mem_read_local_stride_4096;
    }

    public int getMem_read_local_stride_32768() {
        return mem_read_local_stride_32768;
    }

    public void setMem_read_local_stride_32768(int mem_read_local_stride_32768) {
        this.mem_read_local_stride_32768 = mem_read_local_stride_32768;
    }

    public int getMem_read_local_stride_262144() {
        return mem_read_local_stride_262144;
    }

    public void setMem_read_local_stride_262144(int mem_read_local_stride_262144) {
        this.mem_read_local_stride_262144 = mem_read_local_stride_262144;
    }

    public int getMem_read_global_stride_0() {
        return mem_read_global_stride_0;
    }

    public void setMem_read_global_stride_0(int mem_read_global_stride_0) {
        this.mem_read_global_stride_0 = mem_read_global_stride_0;
    }

    public int getMem_read_global_stride_8() {
        return mem_read_global_stride_8;
    }

    public void setMem_read_global_stride_8(int mem_read_global_stride_8) {
        this.mem_read_global_stride_8 = mem_read_global_stride_8;
    }

    public int getMem_read_global_stride_64() {
        return mem_read_global_stride_64;
    }

    public void setMem_read_global_stride_64(int mem_read_global_stride_64) {
        this.mem_read_global_stride_64 = mem_read_global_stride_64;
    }

    public int getMem_read_global_stride_512() {
        return mem_read_global_stride_512;
    }

    public void setMem_read_global_stride_512(int mem_read_global_stride_512) {
        this.mem_read_global_stride_512 = mem_read_global_stride_512;
    }

    public int getMem_read_global_stride_4096() {
        return mem_read_global_stride_4096;
    }

    public void setMem_read_global_stride_4096(int mem_read_global_stride_4096) {
        this.mem_read_global_stride_4096 = mem_read_global_stride_4096;
    }

    public int getMem_read_global_stride_32768() {
        return mem_read_global_stride_32768;
    }

    public void setMem_read_global_stride_32768(int mem_read_global_stride_32768) {
        this.mem_read_global_stride_32768 = mem_read_global_stride_32768;
    }

    public int getMem_read_global_stride_262144() {
        return mem_read_global_stride_262144;
    }

    public void setMem_read_global_stride_262144(int mem_read_global_stride_262144) {
        this.mem_read_global_stride_262144 = mem_read_global_stride_262144;
    }

    public int getMem_write_cnt() {
        return mem_write_cnt;
    }

    public void setMem_write_cnt(int mem_write_cnt) {
        this.mem_write_cnt = mem_write_cnt;
    }

    public int getMem_write_local_stride_0() {
        return mem_write_local_stride_0;
    }

    public void setMem_write_local_stride_0(int mem_write_local_stride_0) {
        this.mem_write_local_stride_0 = mem_write_local_stride_0;
    }

    public int getMem_write_local_stride_8() {
        return mem_write_local_stride_8;
    }

    public void setMem_write_local_stride_8(int mem_write_local_stride_8) {
        this.mem_write_local_stride_8 = mem_write_local_stride_8;
    }

    public int getMem_write_local_stride_64() {
        return mem_write_local_stride_64;
    }

    public void setMem_write_local_stride_64(int mem_write_local_stride_64) {
        this.mem_write_local_stride_64 = mem_write_local_stride_64;
    }

    public int getMem_write_local_stride_512() {
        return mem_write_local_stride_512;
    }

    public void setMem_write_local_stride_512(int mem_write_local_stride_512) {
        this.mem_write_local_stride_512 = mem_write_local_stride_512;
    }

    public int getMem_write_local_stride_4096() {
        return mem_write_local_stride_4096;
    }

    public void setMem_write_local_stride_4096(int mem_write_local_stride_4096) {
        this.mem_write_local_stride_4096 = mem_write_local_stride_4096;
    }

    public int getMem_write_local_stride_32768() {
        return mem_write_local_stride_32768;
    }

    public void setMem_write_local_stride_32768(int mem_write_local_stride_32768) {
        this.mem_write_local_stride_32768 = mem_write_local_stride_32768;
    }

    public int getMem_write_local_stride_262144() {
        return mem_write_local_stride_262144;
    }

    public void setMem_write_local_stride_262144(int mem_write_local_stride_262144) {
        this.mem_write_local_stride_262144 = mem_write_local_stride_262144;
    }

    public int getMem_write_global_stride_0() {
        return mem_write_global_stride_0;
    }

    public void setMem_write_global_stride_0(int mem_write_global_stride_0) {
        this.mem_write_global_stride_0 = mem_write_global_stride_0;
    }

    public int getMem_write_global_stride_8() {
        return mem_write_global_stride_8;
    }

    public void setMem_write_global_stride_8(int mem_write_global_stride_8) {
        this.mem_write_global_stride_8 = mem_write_global_stride_8;
    }

    public int getMem_write_global_stride_64() {
        return mem_write_global_stride_64;
    }

    public void setMem_write_global_stride_64(int mem_write_global_stride_64) {
        this.mem_write_global_stride_64 = mem_write_global_stride_64;
    }

    public int getMem_write_global_stride_512() {
        return mem_write_global_stride_512;
    }

    public void setMem_write_global_stride_512(int mem_write_global_stride_512) {
        this.mem_write_global_stride_512 = mem_write_global_stride_512;
    }

    public int getMem_write_global_stride_4096() {
        return mem_write_global_stride_4096;
    }

    public void setMem_write_global_stride_4096(int mem_write_global_stride_4096) {
        this.mem_write_global_stride_4096 = mem_write_global_stride_4096;
    }

    public int getMem_write_global_stride_32768() {
        return mem_write_global_stride_32768;
    }

    public void setMem_write_global_stride_32768(int mem_write_global_stride_32768) {
        this.mem_write_global_stride_32768 = mem_write_global_stride_32768;
    }

    public int getMem_write_global_stride_262144() {
        return mem_write_global_stride_262144;
    }

    public void setMem_write_global_stride_262144(int mem_write_global_stride_262144) {
        this.mem_write_global_stride_262144 = mem_write_global_stride_262144;
    }

    private int total_reg_age;
    private int reg_age_cnt_1;
    private int reg_age_cnt_2;
    private int reg_age_cnt_4;
    private int reg_age_cnt_8;
    private int reg_age_cnt_16;
    private int reg_age_cnt_32;
    private int reg_age_cnt_64;
    private int mem_read_cnt;
    private int mem_read_local_stride_0;
    private int mem_read_local_stride_8;
    private int mem_read_local_stride_64;
    private int mem_read_local_stride_512;
    private int mem_read_local_stride_4096;
    private int mem_read_local_stride_32768;
    private int mem_read_local_stride_262144;
    private int mem_read_global_stride_0;
    private int mem_read_global_stride_8;
    private int mem_read_global_stride_64;
    private int mem_read_global_stride_512;
    private int mem_read_global_stride_4096;
    private int mem_read_global_stride_32768;
    private int mem_read_global_stride_262144;
    private int mem_write_cnt;
    private int mem_write_local_stride_0;
    private int mem_write_local_stride_8;
    private int mem_write_local_stride_64;
    private int mem_write_local_stride_512;
    private int mem_write_local_stride_4096;
    private int mem_write_local_stride_32768;
    private int mem_write_local_stride_262144;
    private int mem_write_global_stride_0;
    private int mem_write_global_stride_8;
    private int mem_write_global_stride_64;
    private int mem_write_global_stride_512;
    private int mem_write_global_stride_4096;
    private int mem_write_global_stride_32768;
    private int mem_write_global_stride_262144;
}
