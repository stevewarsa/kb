import {Tag} from "src/app/model/tag";

export interface KbEntry {
    id: number;
    title: string;
    desc: string;
    tags: Tag[];
}